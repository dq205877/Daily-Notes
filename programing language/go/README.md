Go 语法层面上呈现了这样的状态：

仅有 25 个关键字，主流编程语言最少；

| break    | default     | func   | interface | select |
| -------- | ----------- | ------ | --------- | ------ |
| case     | defer       | go     | map       | struct |
| chan     | else        | goto   | package   | switch |
| const    | fallthrough | if     | range     | type   |
| continue | for         | import | return    | var    |

内置垃圾收集，降低开发人员内存管理的心智负担；

首字母大小写决定可见性，无需通过额外关键字修饰；

变量初始为类型零值，避免以随机值作为初值的问题；

内置数组边界检查，极大减少越界访问带来的安全隐患；

内置并发支持，简化并发程序设计；

内置接口类型，为组合的设计哲学奠定基础；

原生提供完善的工具链，开箱即用；

36个预定义标识符

| append | bool    | byte    | cap     | close  | complex | complex64 | complex128 | uint16  |
| ------ | ------- | ------- | ------- | ------ | ------- | --------- | ---------- | ------- |
| copy   | false   | float32 | float64 | imag   | int     | int8      | int16      | uint32  |
| int32  | int64   | iota    | len     | make   | new     | nil       | panic      | uint64  |
| print  | println | real    | recover | string | true    | uint      | uint8      | uintptr |



Go 语言的设计哲学：简单、显式、组合、并发和面向工程。