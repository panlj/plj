package cn.edu.usst.plj;

import java.util.Scanner;
//test change
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System .in);
		  Count count= new Count ();
		         int decimal;
		         int choose;
		         System.out.print("Java实现：二进制，十进制，十六进制转换程序\n\n输入任意十进制数：");
		         decimal = scanner .nextInt();
		         System.out.print("输入你要转换的进制格式(2/16):");
		         choose = scanner .nextInt();
		        if(choose==2)
		         count.tobinary(decimal); 
		        if(choose==16)
		        count.tohexadecimal(decimal); 
		      
		 }//main
		 public void tobinary (int d){
		  int q=d,i=-1;
		  int [] r;
		  r= new int[20];
		  //正整数
		  do{
		  r[++i]=q%2;
		  q=q/2;
		  }while(q!=0);
		  System.out.print("十进制数："+d+" 转换成二进制：");
		  while(i>=0){
		   System.out.print(r[i]);
		   i--;
		  }//while
		 }//tobinary

		 public void tohexadecimal(int d){
		  int q=d,i=-1;
		  int [] r;
		  r= new int[20];
		  //正整数
		  do{
		  r[++i]=q%16;
		  q=q/16;
		  }while(q!=0);

		  System.out.print("十进制数："+d+" 转换成十六进制：");
		  while(i>=0){
		   switch(r[i]){
		   case 10: System.out.print("A");break;
		   case 11: System.out.print("B");break;
		   case 12: System.out.print("C");break;
		   case 13: System.out.print("D");break;
		   case 14: System.out.print("E");break;
		   case 15: System.out.print("F");break;
		    default :System.out.print(r[i]);break;
		   }
		   i--;
		  }//while
		  
		 }
	}


