import java.util.*;
public class Stringtask
{
    public static void main(String[] args)
    {
        Implementationstring ob = new Implementationstring();
        //ob.duplicate();
        ob.reverse();
        //ob.occurrence();
        //ob.longest();
        //ob.length();
    }
}

import java.util.*;
public class Implementationstring {
    void duplicate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String str = sc.nextLine();
        char st[] = str.toCharArray();
        for (int i = 0; i < st.length; i++)
        {
            for (int j = i + 1; j < st.length; j++)
            {
                if (st[i] == st[j])
                {
                    System.out.println(st[i] + " ");
                }
            }
        }
    }
    void reverse()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string :");
        String s1=sc.next();
        System.out.println("reversed string : "+rever(s1));
    }
    static String rever(String s1) {
        if(s1.equals("")) {
            return s1;
        }
        else {
            return rever(s1.substring(1))+s1.charAt(0);
        }
    }
    void occurrence()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String str = sc.nextLine();

        int count;
        char string[] = str.toCharArray();
        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j]) {
                    count++;
                    string[j] = '0';
                }
            }
            if(count > 0 && string[i] != '0')
                System.out.print(string[i]+" "+count);
        }
    }
    void longest()
    {
        Scanner sc=new Scanner(System.in);
        String sn="Jangam Nitish kumar";
        System.out.println("enter substring index: ");
        int n=sc.nextInt();
        String sn1=sn.substring(n);
        int count;
        char st[] = sn1.toCharArray();
        for(int i = 0; i <st.length; i++) {
            count = 1;
            for(int j = i+1; j <st.length; j++) {
                if(st[i] == st[j]) {
                    count++;
                    st[j] = '0';
                }
            }
            if(count > 1 && st[i] != '0')
                System.out.println(st[i]+" ");
        }
    }
    void length()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string 1:");
        String s1=sc.next();
        System.out.println("enter string 2:");
        String s2=sc.next();
        String s3=s1+s2;
        if(s1.length()==s2.length()) {
            System.out.println(s3);
        }
        else {
            if(s1.length()>s2.length()) {
                int x=s1.length()-s2.length();
                System.out.println(s1.substring(x)+s2);
            }
            else {
                int z=s2.length()-s1.length();
                System.out.println(s1+s2.substring(z));
            }
        }

    }
}
