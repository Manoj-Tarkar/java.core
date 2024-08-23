package manoj1Loop;

public class Extract_words {
void ext_word(){
	String str="manoj is don Rhit thakur heavy driver ";
	String []words=str.split(" ",7);
	for(String w: words)
	{
		System.out.println(w);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Extract_words obj=new Extract_words();
		obj.ext_word();
	}

}
