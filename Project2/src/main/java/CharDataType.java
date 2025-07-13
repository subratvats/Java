public class CharDataType {
    public static class MyChar{
        private char ch;

        public MyChar(char ch) {
            this.ch = ch;
        }

        public boolean isVowel(){
            if (ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A'
                    ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U')
            {
                System.out.println("It's a vowel");
            }
        return false;
        }

//        boolean isAlphabet(){
//
//        }
//        boolean isNumber(){
//
//        }
    }

    public static void main(String[] args) {
        MyChar mychar = new MyChar('a');
        mychar.isVowel();

    }
}
