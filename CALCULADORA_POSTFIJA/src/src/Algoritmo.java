/**
 *BARTOLINO
 *7 Sept 2023
 */
package src;

import java.util.ArrayList;
import pilas.PilaA;

public class Algoritmo {

    ArrayList<Character> postfija;
    PilaA<Character> pila;

    public Algoritmo() {

    }

 

private int prioridades(Character op) {
        int ans = -1;

        switch (op) {
            case '^':
                ans = 3;
                break;
            case '*':
            case '/':
                ans = 2;
                break;
            case '+':
            case '-':
                ans = 1;
                break;
            case '(':
                ans = 0;
                break;
        
            default:
                break;
        }
        return ans;
    }

    private boolean revisadorParentesis(String revisa) {
        PilaA<Character> pila = new PilaA<>();
        boolean res = false;
        boolean ban = true;
        int i = 0;
        Character ch;

        while (i < revisa.length() && ban) {
            if (revisa.charAt(i) == '(') {
                ch = revisa.charAt(i);
                pila.push(ch);
            } else if (revisa.charAt(i) == ')') {
                if (pila.isEmpty()) {
                    ban = false;
                } else {
                    pila.pop();
                }
            }
            i++;
        }
        if (pila.isEmpty() && ban) {
            res = true;
        }
        return res;
    }
    
    public ArrayList convertidor(String cad){
        int i = 0;
        int j = 0;
        int r = 0;
        boolean band = true;
        ArrayList postfijo = new ArrayList();
        Character ch,ch2,ch3;
        PilaA pila = new PilaA();
        StringBuilder sb = new StringBuilder();
        
        if(revisadorParentesis(cad))
            while(i < cad.length()){
                ch = cad.charAt(i);
                
                if(esOp(ch)== true)
                    postfijo.add(ch);
                else
                    if(ch == '(')
                        pila.push(ch);
                        else
                    if(ch== ')'){
                      while((Character) pila.peek()!= '('){
                                  postfijo.add(pila.pop());
                                  pila.push(ch);
                                  pila.pop();
                                  
                        }
                      pila.pop();
                     
                                  
                    }
                    
                        else
                             if(pila.isEmpty())
                                pila.push(ch);
                             else{
                                 while(!pila.isEmpty() && prioridades((Character) pila.peek()) >= prioridades(ch))
                                           postfijo.add(pila.pop());
                
                                           pila.push(ch);
                             }
                i++;
            }
        
        while(!pila.isEmpty())
            postfijo.add(pila.pop());
        
        
      
        
        
     
        
        
        return postfijo;
    }
    private boolean esOp(char c){
        boolean resp = false;
       switch(c){
           case '0': 
           case '1': 
           case '2': 
           case '3': 
           case '4': 
           case '5': 
           case '6': 
           case '7': 
           case '8': 
           case '9': 
               resp = true;
               break;
               
                 
       }
       return resp;
    }
    public static void main(String[] args) {
        Algoritmo algo = new Algoritmo();
        
        System.out.println(algo.convertidor("(2+2)*4"));
    }
}