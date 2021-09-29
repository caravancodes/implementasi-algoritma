public class ass{
public static void main (String[]args) {
int a,b,c,d,e,i;

a = -5;       
if (a<0) {
a = -a;       
System.out.println(a);
}else
System.out.println("ZONK");


  a = -5;     
   a = -a;        
   a = -a;        
   a = -a;        
   System.out.println(a); 

   a = 5; 
   b = 7;
   a = b;
   b = a;
  System.out.println(a+" "+b);

   a = 5;             
   b = 7;            
   a = a + b;  
   //a = 7 + 5 = 12       
   b = a - b;
   //b = 12 - 7 = 5   
   a = a - b;
   a = 12 - 5 = 7       
   System.out.println(a+" "+b);  

   a = 5;                   
   b = 7;                   
   c = 9;                   
   d = a;
   //d=5                  
   a = b;
   //a=7                  
   b = c; 
   //b=9                     
   c = d;
   //c=5
   // 7 9 5                 
   System.out.println(a+" "+b+" "+c);  

 a = 10;
   b = 8;
   c = 13;
   d = a;
   //d=10
   if (b>d)
      d = b;
   if (c>d)
      d = c;
   System.out.println(d);
  //13


   a = -1;            
   b = 8;             
   for (i=1;i<=5;i++)    
       b = b * a;        
   System.out.println(b); 


   a = 0;              
   for (i=1;i<=5;i++)  
      a = a + i;       
      a = a + 2;       
   System.out.println(a);             
            

a = 12345;
   b = a % 10;
   c = a / 10;
   d = c % 10;
   e = c / 10;
   System.out.println(b+" "+c+" "+d+" "+e);



a = 10;               
    b = 20;                
    while (a<b) {                 
       a = a + 5;         
       b = b + 2;         
    }
    System.out.println(a+" "+b);


a = 50;
    b = 6;
    c = 0;
    d = a;
    while (d>b) {
       d = d - b;
       c = c + 1;
    }
    System.out.println(d+" "+c);

a = 90;
    b = 75;
    c = a;
    while (c % b > 0) {
       c = c + a;
    }
    System.out.println(c);


a = 50;
    b = 8;
    c = b;
    while (c<a)
      c = c + b;
    System.out.println(c);      

}
}