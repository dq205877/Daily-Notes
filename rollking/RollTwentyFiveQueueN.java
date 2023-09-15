package rollking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RollTwentyFiveQueueN {

    public static void main(String[] args) {
        List<List<String>> list = solveNQueens(4);
        System.out.println(list.size());
        System.out.println(list);

    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<List<String>>();
        int[] queens = new int[n];
        //填充-1;
        Arrays.fill(queens,-1);
        //横
        Set<Integer> columns = new HashSet<Integer>();
        //撇
        Set<Integer> diagonals1 = new HashSet<Integer>();
        //捺
        Set<Integer> diagonals2 = new HashSet<Integer>();
        backtrack(solutions,queens,n,0,columns,diagonals1,diagonals2);
        return solutions;
    }

    //回溯
    private static void backtrack(List<List<String>> solutions, int[] queens, int n, int row,
    Set<Integer> columns,Set<Integer> diagonals1,Set<Integer> diagonals2){
        //当填的数等于N时，生成结果
        if(row == n){
            List<String> board = generateBoard(queens,n);
            solutions.add(board);
        } else {
            for(int i = 0; i < n; i++){
                //检查横
                if(columns.contains(i)){
                    continue;
                }
                int diagonal1 = row - i;
                //检查撇
                if(diagonals1.contains(diagonal1)){
                    continue;
                }
                int diagonal2 = row + i;
                //检查捺                
                if(diagonals2.contains(diagonal2)){
                    continue;
                }
                //成功把下标记录好
                queens[row] = i;
                columns.add(i);
                diagonals1.add(diagonal1);
                diagonals2.add(diagonal2);
                //检查下一行
                backtrack(solutions,queens,n,row + 1, columns,diagonals1,diagonals2);
                //
                queens[row] = -1;
                columns.remove(i);
                diagonals1.remove(diagonal1);
                diagonals2.remove(diagonal2);
            }
        }
    }

    //生成结果
    private static List<String> generateBoard(int[] queens, int n){
        List<String> board = new ArrayList();
        for(int i = 0; i < n; i++){
            char[] row = new char[n];
            Arrays.fill(row,'*');
            //将下标填充Q
            row[queens[i]] = 'Q';
            board.add(new String(row));
        }
        return board;
    }
    
}
