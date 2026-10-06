public class minAddToMakeValid {
     public int minAddToMakeValid(String s) {
        int openBrackets = 0;
        int minAddRequired = 0;
        for(char c: s.toCharArray()){
            if(c == '('){
                openBrackets++;
            }
            else{
                if(openBrackets > 0){
                    openBrackets--;
                }
                else{
                    minAddRequired++;
                }
            }
        }
        return openBrackets + minAddRequired;
    }
}
