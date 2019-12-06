package review;

import java.util.ArrayList;
import java.util.List;

public class NO5263 {
	public void trace(int[][] g, int k, int i, int[][] res,int[][] keep){
		int lie = g[0].length;
		int hang = g.length;
		if(i == k){
			
			res = g;
			for(int m = 0; m < res.length; m++){
				
				for(int n = 0; n < res[0].length; n++){
					keep[m][n] = res[m][n];
				}
			}
			return;
		}
		//i传入的时候是0
		for(int t = 0; t <= hang - 2; t++){
			res[t + 1][0] = g[t][lie - 1];
		}
		res[0][0] = g[hang - 1][lie - 1];
		
		for(int t = 0; t <= hang - 1; t++){
			for(int l = 0; l <= lie - 2; l++){
				res[t][l + 1] = g[t][l];
			}
		}
		g = res;//g指针指向的内存区域变了
//		System.out.println("wo" + i);
//		System.out.println(res.length + "what");
		//System.out.println(g[0].length);
//		for(int m = 0; m < res.length; m++){
//			for(int n = 0; n < res[0].length; n++){
//				if(n != res[0].length - 1)
//					System.out.print(res[m][n]+ "^^");
//				else
//					System.out.println(res[m][n]);
//			}
//		}
	//	System.out.println("caobi");
	
		res = new int[hang][lie];//res指向的内存区域也变了
		
		trace(g, k, i + 1, res, keep);
	
		
	}
	public List<List<Integer>> shiftGrid(int[][] grid, int k){
		int lie = grid[0].length;
		int hang = grid.length;
		int res[][] = new int[hang][lie];//但是这里的res一直指向的是原来的那块内存区域
		int keep[][] = new int[hang][lie];//
		List<List<Integer>> re = new ArrayList<>();
		
		//变一次
//		for(int i = 1; i <= hang - 1; i++){
//			res[i - 1][0] = grid[i][lie - 1];
//		}
//		res[0][0] = grid[hang - 1][lie - 1];
//		
//		for(int i = 0; i <= hang - 1; i++){
//			for(int l = 0; i <= lie - 2; l++){
//				res[i][l + 1] = grid[i][l];
//			}
//		}
		//---------
		trace(grid, k, 0, res, keep);
//		
		for(int m = 0; m < res.length; m++){
			List<Integer> temp = new ArrayList<>();
			for(int n = 0; n < res[0].length; n++){
				temp.add(keep[m][n]);
				if(n == res[0].length - 1)
					re.add(temp);
			}
		}
		return re;
	}
	//总结： 指针也只是变量  指针作为变量传进函数里 函数修改了指针指向的地址值 即修改了这个变量值 出了函数以后
	//指针的值还是不变的 它还是指向原来的地址  在函数里改也没有用
 }
