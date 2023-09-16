
package src;

import java.util.ArrayList;
import pilas.PilaA;
import pilas.PilaADT;
import pilas.ExceptionColeccionVacia;

/**
 *
 * @author maher
 */

public class Algoritmo {
    private String operaciones;
    
    public Algoritmo(String operaciones){
        this.operaciones=operaciones;
    }

     public boolean revisadorPuntos(){//AFIRMA QUE LA SINTAXIS DE PUNTOS ESTÉ CORRECTA
        boolean resp= true;
        
        boolean band= true;
        boolean bandera= false;
        int contPuntos=0;
        int i=0;
        
        while(i< operaciones.length() && band){
            if (operaciones.charAt(i) == '.'){
                 contPuntos+=1;
            }           
            if(esOperador(operaciones.charAt(i)) || operaciones.charAt(i) == '!'){
                bandera= true;
            }           
            if(contPuntos > 1 && !bandera){
                band= false;
            }
            i++;
        }                
        if(band == true){
            return  resp;
        } else 
            resp= false;
                    return resp;
        
    }
    
    public boolean revisadorParentesis() {
=======
    public static boolean revisadorPuntos(String revisa){
        boolean resp= true;
        
        boolean band= true;
        boolean bandera= false;
        int contPuntos=0;
        int i=0;
        
        while(i< revisa.length() && band){
            if (revisa.charAt(i) == '.'){
                 contPuntos+=1;
                 bandera=false;
            }           
            if(revisa.charAt(i) == '+' || revisa.charAt(i) =='-' ||revisa.charAt(i) == '*' ||revisa.charAt(i) == '/'||revisa.charAt(i) == '^'){
                bandera= true;
                band=true;            
            }           
            if(contPuntos > 1 && !bandera){
                band= false;
            }
            i++;
        }                
        if(band == true){
            return  resp;
        } else 
            resp= false;
                    return resp;   
    }
    
    private static boolean revisadorParentesis(String revisa) {
>>>>>>> origin/master
        PilaA<Character> pila = new PilaA<>();
        boolean res = false;
        boolean ban = true;
        int i = 0;
        Character ch;

        while (i < operaciones.length() && ban) {
            if (operaciones.charAt(i) == '(') {
                ch = operaciones.charAt(i);
                pila.push(ch);
            } else if (operaciones.charAt(i) == ')') {
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
    
    public boolean revisadorSignos() {
        boolean correcto = true;
        PilaA<Character> signos = new PilaA();
        PilaA<Character> negativo = new PilaA();
        int tamanho, i=0;
        Character ch;
        
        tamanho=operaciones.length();
        while(i<tamanho && correcto){
            ch=operaciones.charAt(i);
            if(esOperador(ch))
                    if(!negativo.isEmpty() || !signos.isEmpty())
                        correcto=false;
                    else
                        signos.push(ch);
            else{
                if(ch.equals('!')){
                    if(!negativo.isEmpty())
                        correcto=false;
                    else
                        negativo.push(ch);
                }
                else{
                    if(ch != '('){
                        if (!signos.isEmpty()) 
                            signos.pop();
                        if(!negativo.isEmpty())
                            negativo.pop();
                    }
                }
            }
            i++;
        }
        if (!signos.isEmpty() && correcto) 
            correcto = false;
        if(!negativo.isEmpty() && correcto)
            correcto =false;
        return correcto;
    }
    
    private boolean esOperador (Character ch){
        boolean res=false;
        
        if(ch == '+' || ch == '*' || ch == '/' || ch == '^' || ch == '-')
            res=true;
        return res;
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
            case '!':
                ans = 1;
                break;
            case '(':
            case ')':
                ans = 0;
                break;
            default:
                break;
        }
        return ans;
    }

    public ArrayList convertidor() {
        int i=0;
        double numero;
        ArrayList postfijo = new ArrayList();
        Character ch;
        PilaA pila = new PilaA();
        StringBuilder sb = new StringBuilder();
        boolean bandera;

       while(i<operaciones.length()) {
            ch = operaciones.charAt(i);
            if (prioridades(ch) < 0) {
                sb.append(ch);
            } else {
                switch (ch) {
                    case '(':
                        pila.push(ch);
                        break;
                    case ')':
                        System.out.println(sb.toString());
                        while ((Character) pila.peek() != '(') {
                            if(sb.length() != 0){
                                numero = Double.parseDouble(sb.toString());
                                sb.setLength(0);
                                postfijo.add(numero);
                            }
                            postfijo.add(pila.pop());
                            pila.push(ch);
                            pila.pop();
                        }
                        pila.pop();
                        break;
                    case '!':
                        i++;
                        ch = operaciones.charAt(i);
                        if(operaciones.charAt(i)!= '('){
                            bandera=true;
                            while(prioridades(ch) < 0 && bandera){
                                sb.append(ch);
                                i++;
                                if(i >= operaciones.length())
                                    bandera=false;
                                else
                                    ch=operaciones.charAt(i);
                            }   
                            numero = Double.parseDouble(sb.toString());
                            sb.setLength(0);
                            numero = numero*-1;
                            postfijo.add(numero);
                        }
                        else{
                            pila.push('!');
                        }
                        i--;
                        break;
                    default:
                        if (sb.length() != 0) {
                            numero = Double.parseDouble(sb.toString());
                            sb.setLength(0);
                            postfijo.add(numero);
                        }
                        if (pila.isEmpty()) {
                            pila.push(ch);
                        } else {
                            while (!pila.isEmpty() && prioridades((Character) pila.peek()) >= prioridades(ch)) {
                                postfijo.add(pila.pop());
                            }
                            pila.push(ch);
                        }
                        break;
                }
            }
            i++;
        }
        if (sb.length() != 0) {
            numero = Double.parseDouble(sb.toString());
            postfijo.add(numero);
        }
        while (!pila.isEmpty()) {
            postfijo.add(pila.pop());
        }
        return postfijo;
    }
    
    public double evalua(ArrayList postfijo) {
        double ans;
        double v;
        double x, y;
        PilaA<Double> pila = new PilaA();
        Character p;
        
        for (int i = 0; i < postfijo.size(); i++){
            try {
                pila.push((Double) postfijo.get(i));
            } catch (ClassCastException err) {
                p = (Character) postfijo.get(i);
                switch (p) {
                    default:
                        break;
                    case '+':
                        x = (double) pila.pop();
                        y = (double) pila.pop();
                        v = x + y;
                        pila.push(v);
                        break;
                    case '-':
                        x = (double) pila.pop();
                        y = (double) pila.pop();
                        v = y - x;
                        pila.push(v);
                        break;
                    case '!':
                        x = (double) pila.pop();
                        v = x*-1;
                        pila.push(v);
                        break;
                    case '*':
                        x = (double) pila.pop();
                        y = (double) pila.pop();
                        v = x * y;
                       pila.push(v);
                        break;
                    case '/':
                        x = (double) pila.pop();
                        y = (double) pila.pop();
                        v = y / x;
                        pila.push(v);
                        break;
                    case '^':
                        x = (double) pila.pop();
                        y = (double) pila.pop();
                        v = Math.pow(y, x);
                        pila.push(v);
                        break;
                }
            }

        }
        ans = (double) pila.pop();
        return ans;
    }

    public static void main(String[] args) {
        Algoritmo calc;
        ArrayList convertidor;
        
        calc=new Algoritmo("!2^");
        if(calc.revisadorParentesis() && calc.revisadorPuntos() && calc.revisadorSignos()){
            convertidor=calc.convertidor();
            System.out.println(convertidor);
            System.out.println(calc.evalua(convertidor));
        }
        else
            System.out.println("SYNTAX_ERROR");
    }
}



