import java.io.*;
import java.lang.*;
class Vowel
{
public static void main(String args[])throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char ch;
ch=(char)br.read();
if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
{
System.out.println("The character is vowel");
}
else if((ch>=97)&&(ch<=122))
{
System.out.println("The character is consonant");
}
else
{
System.out.println("Invalid data");
}
}
}

