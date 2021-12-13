import java.io.*;
import java.util.ArrayList;
 class Main {
  public static void main(String args[]) throws Exception{
    FileReader file=new FileReader("input.txt");
    BufferedReader br=new BufferedReader(file);
    String s=null;
    int x=0,y=0;
    ArrayList<String> sr=new ArrayList<String>();
    ArrayList<Integer> ar=new ArrayList<Integer>();
    while((s=br.readLine())!=null){
           sr.add(s);
    }
   String tp[]= sr.toArray(new String[sr.size()]);
   for(int i=0;i<1000;i++){
       String val=tp[i];
       String f2=val.substring(0,2);
       if(f2.equals("fo")){
         char f3=val.charAt(val.length()-1);
        int  x1= Character.getNumericValue(f3);
         x=x+x1;
       }
       else if(f2.equals("up")){
         char f4=val.charAt(val.length()-1);
            int y1=Character.getNumericValue(f4);
           y=y+y1;   
       }
       else if(f2.equals("do")){
         char f5=val.charAt(val.length()-1);
           int y2=Character.getNumericValue(f5);
           y=y-y2;
       }   
   
  }
  System.out.println(Math.abs(x*y));
 }
}
 
 