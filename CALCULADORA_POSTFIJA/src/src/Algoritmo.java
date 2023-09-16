/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.ArrayList;
import pilas.PilaA;
import pilas.PilaADT;
import pilas.ExceptionColeccionVacia;

/**
 * Adolfo Yúnez, Patricio Bartolino Miguel Herrera, Bernardo del Río, Tomás Boom
 * Agosto-Septiembre 2023
 * Esto es un programa el cual a través de una cadena con operaciones, va a convertir las operaciones de infijo a postfijo para después evaluarlas y respetar el PEMDAS.
 */

public class Calculadora {
    private String operaciones; //Vamos a crear una clase calculadora y su único atributo va a ser la cadena.
    
    public Calculadora(){
        
    }
    
    public Calculadora(String operaciones){
        this.operaciones=operaciones;
    }
    
    public void setOperaciones(String operaciones){
        this.operaciones=operaciones;
    }
    
    public String getOperaciones(){
        return operaciones;
    }
    
    //Este es un método para analizar si el carácter es operador y mejorar la sintáxis de los programas.
    private boolean esOperador (Character ch){
        boolean res=false;
        
        if(ch == '+' || ch == '*' || ch == '/' || ch == '^' || ch == '-')
            res=true;
        return res;
    }

    //Los siguientes métodos son para la revisión de sintáxis
    //Este primer método va a revisar la puntuación, es decir, evitar que el usuario ponga 1..0, ya que esto no es un número.
     public boolean revisadorPuntos(){
        boolean correcto= true;
        int contPuntos=0;
        int i=0;
        
        while(i< operaciones.length() && correcto){ //Se utiliza un while porque hay una bandera.
            //Si hay puntos, se van a contar todos los puntos que existen antes de un operador.
            if (operaciones.charAt(i) == '.'){ 
                 contPuntos+=1;
            }           
            else{
                //Cuando encuentre un operador, la cuenta se va a reiniciar, ya que significa que luego se va a utilizar otro número.
                if(esOperador(operaciones.charAt(i)) || operaciones.charAt(i) == '!') //El símbolo '!' que significa (-) también se vuelve parámetro.
                    contPuntos=0;
            }           
            if(contPuntos > 1) //Si el contador es mayor a 1, significa que hay dos puntos antes de un operador, por ende la sintáxis está mal.
                correcto= false;
            i++;
        }                
        return correcto;
    }
    
     //El siguiente método revisa que los parámetros estén bien balanceados, es decir, que cada '(' tenga un ')'.
    public boolean revisadorParentesis() {
        PilaA<Character> pila = new PilaA<>(); //Se utiliza una pila, porque es lo más eficiente.
        boolean res = false;
        boolean ban = true;
        int i = 0;
        Character ch;

        while (i < operaciones.length() && ban) {
            if (operaciones.charAt(i) == '(') {
                ch = operaciones.charAt(i); //Cuando encuentre un paréntesis '(' se agrega a la pila.
                pila.push(ch);
            } else if (operaciones.charAt(i) == ')') { //Cuando encuentra el contrario, i.e, ')' entonces:
                if (pila.isEmpty()) {//Pregunta si existió un paréntesis '(' antes.
                    ban = false; //Si no, arroja un error, ya que no está balanceado.
                } else {
                    pila.pop(); //Si sí, saca el paréntesis de la pila, porque ya encontró a su pareja.
                }
            }
            i++;
        }
        if (pila.isEmpty() && ban) { //La pila tiene que terminar vacía para que si estén bien balanceados.
            res = true;
        }
        return res;
    }
    
public boolean revisadorSignos() {
        boolean correcto = true; //Esta es la bandera.
        PilaA<Character> signos = new PilaA();
        PilaA<Character> negativo = new PilaA(); //Se crea una pila aparte para revisar que no existan dos !!, ni tampoco un !+, !-, !*, etc.
        int tamanho, i=0;
        Character ch;
        
        ch=operaciones.charAt(0);
        if(esOperador(ch))
            correcto=false;
        else
            i++;
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
        Calculadora calc;
        ArrayList convertidor;
        
        calc=new Calculadora("1.0+2.0");
        if(calc.revisadorParentesis() && calc.revisadorPuntos() && calc.revisadorSignos()){
            convertidor=calc.convertidor();
            System.out.println(convertidor);
            System.out.println(calc.evalua(convertidor));
        }
        else
            System.out.println("SYNTAX_ERROR");
    }
}
