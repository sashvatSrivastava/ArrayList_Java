import java.util.*;

public class ArrayListResp {
	public static void main(String args[])
	{
		System.out.println("Tell the computer how many values you want to enter");
        Scanner val = new Scanner(System.in);
        int value = val.nextInt();
        ArrayList<String> strings = new ArrayList<String>();
        
        for(int i = 0; i < (value); i++)
        {
        	System.out.println("Enter string number " + (i+1));
            String inp = val.nextLine();
            strings.add(inp);
        }
        System.out.println(strings);
        val.close();
	}
}
