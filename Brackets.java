public class Brackets {
	public static boolean isCorrect(String phrase) {
		ArrayStack<Character> bracketStack = new ArrayStack<Character>(100);
		
		for(int i = 0; i < phrase.length(); i++) {
			char cur = phrase.charAt(i);
			if(cur == '(' || cur == '[' || cur == '{') {
				bracketStack.push(cur);
			}
			else if(cur == ')' || cur == ']' || cur == '}') {
				if(bracketStack.isEmpty()) {
					return false;
				}
				char left = bracketStack.pop();
				if(!ifMatch(left, cur)){
					return false;
				}
			}
		}
		return (bracketStack.isEmpty());
	}
	
	public static boolean ifMatch(char left, char right) {
		switch(left) {
			case '(':
			{
				return (right == ')');
			}
			case '[':
			{
				return (right == ']');
			}
			case '{':
			{
				return (right == '}');
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String phrase = "s x (s - a) x s - b) x (s - c)";
		System.out.println(phrase + " has " + (isCorrect(phrase) ? "correct" : "incorrect") + " brackets.");
	}
}
