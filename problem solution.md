一、[Err] 1709 - Index column size too large. The maximum column size is 767 byte

1.查看 `innodb_file_format` 相关变量SQL：
`show variables like '%innodb_file_format%';`

2.更改变量SQL：
`set global innodb_file_format=Barracuda;`
`set global innodb_file_format_check=ON;`
`set global innodb_file_format_max=Barracuda;`

或者mysql配置文件增加这两个配置

innodb_large_prefix=on
innodb_file_format=BARRACUDA



3.create table 语句加 ROW_FORMAT=DYNAMIC

例：

CREATE TABLE `xxx` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `registry_group` varchar(50) NOT NULL,
  `registry_key` varchar(255) NOT NULL,
  `registry_value` varchar(255) NOT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `i_g_k_v` (`registry_group`,`registry_key`,`registry_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

总结原因：据说是因为mysql版本低于5.7