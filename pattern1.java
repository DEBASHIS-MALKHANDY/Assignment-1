package Assingment1;

public class pattern1 {

	public static void main(String[] args) {
		int i,j,n;
	      n=10;
	      for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	          if (j==0 || i==0 && j<(n-1)/2 || j==n/2 && i>0 && i<n-1 || i==n-1 && j<(n-1)/2){
	            System.out.print("*");
	          }
	          else{
	            System.out.print(" ");
	          }
	          
	        }
	        for(j=0;j<n;j++){
	          if(j==0 || i==0 && j<=(n-1)/2 || i==n-1 && j<=(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2){
	            System.out.print("*");
	          }
	          else{
	            System.out.print(" ");
	          }
	          
	        }
	        for(j=0;j<n;j++){
	          if(j==0 || i==0 && j<(n-1)/2 || i==n-1 && j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 
	        		  || j==(n+1)/2 && i>0 && i<n-1 && i!=(n-1)/2){
	            System.out.print("*");
	          }
	          else{
	            System.out.print(" ");
	          }
	          
	        }
	        for(j=0;j<n;j++){
	          if(j==0 && i!=0 || i==0 && j>1 && j<(n-1)/2 || j==(n+1)/2 && i!=0 
	        		  || i==(n-1)/2 && j<(n+1)/2 ){
	            System.out.print("*");
	          }
	          else{
	            System.out.print(" ");
	          }
	          
	        }
	        for(j=0;j<n;j++){
	          if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 && i<(n-1)/2 
	        		  || i==(n-1)/2 && j>0 && j<(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 && i!=n-1 
	        		  || i==n-1 && j<(n-1)/2){
	            System.out.print("*");
	          }
	          else{
	            System.out.print(" ");
	          }
	          
	        }
	        for(j=0;j<n;j++){
		          if(j==0 || j==n-3 || i==(n-1)/2 && j<n-3){
		            System.out.print("*");
		          }
		          else{
		            System.out.print(" ");
		          }
		          
		        }
	        for(j=0;j<n;j++){
		          if(i==0 && j>0 && j<n-1|| i==n-1 && j>0 && j<n-1 || j==(n-1)/2){
		            System.out.print("*");
		          }
		          else{
		            System.out.print(" ");
		          }
		          
		        }
	        for(j=0;j<n;j++){
		          if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 && i<(n-1)/2 
		        		  || i==(n-1)/2 && j>0 && j<(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 && i!=n-1 
		        		  || i==n-1 && j<(n-1)/2){
		            System.out.print("*");
		          }
		          else{
		            System.out.print(" ");
		          }
		          
		        }
	        for(j=0;j<n;j++){
		          if(i==0 && j>0 && j<n-2|| i==n-1 && j>0 && j<n-2 || j==(n-1)/2){
		            System.out.print("*");
		          }
		          else{
		            System.out.print(" ");
		          }
		          
		        }
	        for(j=0;j<n;j++){
		          if(j==0 || j==n-1 || i==j){
		            System.out.print("*");
		          }
		          else{
		            System.out.print(" ");
		          }
		          
		        }
	        for(j=0;j<n;j++){
		          if(j==3 || i==0 && j>2 && j<(n-2) 
		        		  || i==n-1 && j>2 && j<(n-2) || i==(n-1)/2 && j>2 && j<(n-2)){
		            System.out.print("*");
		          }
		          else{
		            System.out.print(" ");
		          }
		          
		        }
	        for(j=0;j<n;j++){
		          if(j==0 && i!=n-1 || i==n-1 && j>0 && j<n-3 || j==n-3 && i!=n-1 ){
		            System.out.print("*");
		          }
		          else{
		            System.out.print(" ");
		          }
		          
		        }
	        for(j=0;j<n;j++){
		          if(j==0||i==0 &&j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 || 
		        		 j==(n-1)/2 && i>0 && i<(n-1)/2 || i-j==(n-1)/2 ){
		            System.out.print("*");
		          }
		          else{
		            System.out.print(" ");
		          }
		          
		        }
	        for(j=0;j<n;j++){
		          if(j==0 && i>0 && i<n-1 || i==0 && j>0 && j<(3*n)/4 ||j==(3*n)/4 && i>0 && i<n-1 
		        		  ||i==n-1 && j>0 && j<(3*n)/4  ){
		            System.out.print("*");
		          }
		          else{
		            System.out.print(" ");
		          }
		          
		        }
	        for(j=0;j<n;j++){
		          if( j==0 || j==n-1 || i==j){
		            System.out.print("*");
		          }
		          else{
		            System.out.print(" ");
		          }
		          
		        }
	         System.out.println();
	      }
	     
	      
	  }
	

	}


