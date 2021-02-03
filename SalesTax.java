//Pritee Pawar (pawarpritee555@gmail.com)
import java.util.*;
class SalesTax{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int choice=0,count=0;
    double total=0;
    double itax=0;
    int ch=0;

    String items[]={"Books","Music CD's","Perfumes","Chocolte","Medicines","Exit"};
    String cart[]=new String[10];
    double finalprice[]=new double[10];
    double tax=0;
    int qnty[]=new int[10];
    do{
    System.out.println("\n***************** MAIN *********************");
    System.out.println("-------------------------------------------");
    System.out.println("ID"+"\t"+"ITEM NAME");
    System.out.println("-------------------------------------------");
    for(int i=0;i<items.length;i++)
    {
        System.out.println(i+1+"\t"+items[i]);
    }
    System.out.println("-------------------------------------------");
    System.out.println("Please select your option...");
    choice=sc.nextInt();
    switch(choice)
    {
      case 1:
            do{
                System.out.println("\n***************** Books *********************");
            String books[]={"Imported Books","Advanture Books","Storey Books","Agriculture Books","Exit"};
            int B_price[]={100,200,150,230,00};
            System.out.println("-------------------------------------------");
            System.out.println("ID"+"\t"+"ITEM NAME"+"\t\t"+"PRICE");
            System.out.println("-------------------------------------------");
            for(int i=0;i<books.length;i++)
            {
                 System.out.println(i+1+"\t"+books[i]+"\t\t"+B_price[i]);
            }
            System.out.println("-------------------------------------------");
            System.out.println("Please select your option...");
            ch=sc.nextInt();
            if(ch<5)
            {
            System.out.println("Please enter quantity....");
            int q=sc.nextInt();
            if(ch==1)
            {
                itax=B_price[ch-1]*(0.05);
            }
            qnty[count]=q;
            cart[count]=books[ch-1];
            finalprice[count]=B_price[ch-1]*qnty[count]+itax;
            count++;
            itax=0;
            }
            }while(ch<5);
        break;
      case 2:
            do{
                System.out.println("\n***************** Music CD's *********************");
                String music[]={"Old Music CD","90's Music CD","Imported CD's","English Music CD","Exit"};
                double m_price[]={12.99,16.20,15,12.30,00};
                System.out.println("-------------------------------------------");
                System.out.println("ID"+"\t"+"ITEM NAME"+"\t\t"+"PRICE");
                System.out.println("-------------------------------------------");
                for(int i=0;i<music.length;i++)
                {
                    System.out.println(i+1+"\t"+music[i]+"\t\t"+m_price[i]);

                }      
                System.out.println("-------------------------------------------");
                System.out.println("Please select your option...");
                ch=sc.nextInt();
                tax+=m_price[ch-1]*(0.1);
                if(ch<5)
                {
                    System.out.println("Please enter quantity....");
                    int q=sc.nextInt();
                    if(ch==3)
                    {
                        itax=m_price[ch-1]*(0.05);
                    }
                    qnty[count]=q;
                    cart[count]=music[ch-1];
                    finalprice[count]=m_price[ch-1]*qnty[count]+itax;
                    count++;
                    itax=0;
                }
            }while(ch<5);
       break;
       case 3:
            do{
                System.out.println("\n***************** Perfume *********************");
                String perfu[]={"Imported Perfume's","Chanel","Miss Divor","Exit"};
                double p_price[]={200,150,300,00};
                System.out.println("-------------------------------------------");
                System.out.println("ID"+"\t"+"ITEM NAME"+"\t\t"+"PRICE");
                System.out.println("-------------------------------------------");
                for(int i=0;i<perfu.length;i++)
                {
                    System.out.println(i+1+"\t"+perfu[i]+"\t\t"+p_price[i]);

                }      
                System.out.println("-------------------------------------------");
                System.out.println("Please select your option...");
                ch=sc.nextInt();
                tax+=p_price[ch-1]*(0.1);
                if(ch<4)
                {
                System.out.println("Please enter quantity....");
                int q=sc.nextInt();
                if(ch==1)
                {
                    itax=p_price[ch-1]*(0.05);
                }
                qnty[count]=q;
                cart[count]=perfu[ch-1];
                finalprice[count]=p_price[ch-1]*qnty[count]+itax;
                count++;
                itax=0;
                }
            }while(ch<4);
       break;
       case 4:
            do{
                System.out.println("\n***************** Chocolates *********************");
                String choco[]={"Imported Chocolate's","Amul Chocolates","DairyMilk","Exit"};
                double c_price[]={20,15,30,00};
                System.out.println("-------------------------------------------");
                System.out.println("ID"+"\t"+"ITEM NAME"+"\t\t"+"PRICE");
                System.out.println("-------------------------------------------");
                for(int i=0;i<choco.length;i++)
                {
                    System.out.println(i+1+"\t"+choco[i]+"\t\t"+c_price[i]);

                }      
                System.out.println("-------------------------------------------");
                System.out.println("Please select your option...");
                ch=sc.nextInt();
                tax+=c_price[ch-1]*(0.1);
                if(ch<4)
                {
                System.out.println("Please enter quantity....");
                int q=sc.nextInt();
                if(ch==1)
                {
                    itax=c_price[ch-1]*(0.05);
                }
                qnty[count]=q;
                cart[count]=choco[ch-1];
                finalprice[count]=c_price[ch-1]*qnty[count]+itax;
                count++;
                itax=0;
                }
            }while(ch<4);
       break;
       case 5:
            do{
                System.out.println("\n***************** Medicines *********************");
                String medi[]={"Heart Medicines","Brain Medicines","Pain Medicines","Exit"};
                double e_price[]={20,15,30,00};
                System.out.println("-------------------------------------------");
                System.out.println("ID"+"\t"+"ITEM NAME"+"\t\t"+"PRICE");
                System.out.println("-------------------------------------------");
                for(int i=0;i<medi.length;i++)
                {
                    System.out.println(i+1+"\t"+medi[i]+"\t\t"+e_price[i]);

                }      
                System.out.println("-------------------------------------------");
                System.out.println("Please select your option...");
                ch=sc.nextInt();
                if(ch<4)
                {
                System.out.println("Please enter quantity....");
                int q=sc.nextInt();
                qnty[count]=q;
                cart[count]=medi[ch-1];
                finalprice[count]=e_price[ch-1]*qnty[count];
                count++;
                itax=0;
                }
            }while(ch<4);
       break;
      }
    }while(choice<6);
    System.out.println("\t*****************Your Order****************");
    System.out.println("---------------------------------------------------------------");
    System.out.println("ID"+"\t"+"ITEM NAME"+"\t\t\t"+"PRICE"+"\t\t"+"QUANTITY");
    System.out.println("---------------------------------------------------------------");
    for(int i=0;i<count;i++)
    {
        System.out.println(i+1+"\t"+cart[i]+"\t\t\t"+finalprice[i]+"\t\t"+qnty[i]);
    }
    System.out.println("----------------------------------------------------------------");
    tax=Math.round(tax*100.0)/100.0;
    System.out.println("Including Sales Taxes: "+tax+"$");
    for(int i=0;i<count;i++)
      total+=finalprice[i];
    total=Math.round(total*100.0)/100.0;
    System.out.println("Total: "+(total+tax)+"$");
    System.out.println("Thanku....Please Visit again...!");
}
}