package homework;

import java.io.*;
class Trik 
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(in);
        int i=0,tmp; char g; int abc[]={1,0,0};
        System.out.print("Input ABC : ");
        String c = buf.readLine().toUpperCase();
        while (i != c.length())
        {
            g = c.charAt(i);
            	if (g == 'A') {
            		tmp = abc[0];
            		abc[0] = abc[1];
            		abc[1] = tmp;
            }
            	else if (g == 'B')
            {
            		tmp = abc[1];
            		abc[1] = abc[2];
            		abc[2] = tmp;
            }
            	else if (g == 'C')
            {
            		tmp = abc[0];
            		abc[0] = abc[2];
            		abc[2] = tmp;
            }
            	i++;
        }
        for (i =0;i<3 ;i++)
        {
            	if(abc[i] == 1)
            		System.out.println(i+1);
        }
    }
}

 