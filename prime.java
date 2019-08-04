class prime
{ 
          public static void main(String ar[])
          { 
                    int i,j;
                    System.out.print("Prime nos from 0 to 100 are 1,2,");

                    for(i=3;i<=100;i++)
                    {
                              for(j=2;j<i;j++)
                              {
                                        if(i%j==0)
                                        break;
                              }

                              if(i==j)
                              System.out.print(i+",");
                    }
          }
}