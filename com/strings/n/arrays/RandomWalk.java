package com.strings.n.arrays;

import java.util.*;

public class RandomWalk {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the dimension of matrix to walk");
		
		int dim = scanner.nextInt();
		
		//set the matrix for x and y-axis
		int [] x_axis = new int[dim];
		
		int [] y_axis = new int[dim];
		
		//boolean array to mark number of cells visited
		boolean [][] visited = new boolean[dim][dim];
		
		//counter for cells to visit
		int cellstovisit = dim * dim;
		
		int steps = 0;
		
		//starting in the center of an n­-by­-n grid
		
		for (int i = 0; i < dim; i++) {
       
			x_axis[i] = dim/2;
          
			y_axis[i] = dim/2;
        }
        visited[dim/2][dim/2] = true;
        
        cellstovisit--;
        
        while(cellstovisit > 0)
        {
        	steps++;
        	
        	for(int i=0; i<dim ; i++) {
        		
        	
        	double r= Math.random();
        	
        	if(r <= 0.25)
        		x_axis[i]++;
        	
        	else if(r <= 0.5)
        		x_axis[i]--;
        	
        	else if(r <= 0.75)
        		y_axis[i]++;
        	
        	else if(r <= 1.00)
        		y_axis[i]--;
        		
        
        	//checking end points
        	if(x_axis[i] < dim && y_axis[i] < dim && x_axis[i] >= 0 && y_axis[i] >= 0 && !visited[x_axis[i]][y_axis[i]]) {
        		
        		 cellstovisit--;
        		 
                 visited[x_axis[i]][y_axis[i]] = true;
        	}

	}
        }
        
        System.out.println("Walker covered " +steps+ " steps");
	}
}
