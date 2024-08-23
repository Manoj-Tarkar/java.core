package manoj1Loop;

public class Alphabet {
void Alphabets(){
	System.out.println("Enter alphabet small :");
	char ch;
	
	for (ch='a';ch<='z';ch++){
		System.out.println(ch);
	}
}
	public static void main(String[] args) {
		Alphabet obj=new Alphabet();
		obj.Alphabets();
	}

}
