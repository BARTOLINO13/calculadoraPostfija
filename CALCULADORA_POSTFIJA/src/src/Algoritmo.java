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

    private static boolean revisadorParentesis(String revisa) {
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

    private static int prioridades(Character op) {
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
            case ')':
                ans = 0;
                break;

            default:
                break;
        }
        return ans;
    }

    public static ArrayList convertidor(String cad) {
        int i = 0;
        double numero = 0;
        boolean band = true;
        ArrayList postfijo = new ArrayList();
        Character ch;
        PilaA pila = new PilaA();
        StringBuilder sb = new StringBuilder();

        while (i < cad.length()) {
            ch = cad.charAt(i);

            if (prioridades(ch) < 0) {
                sb.append(ch);
            } else {
                switch (ch) {
                    case '(':
                        pila.push(ch);
                        break;
                    case ')':
                        while ((Character) pila.peek() != '(') {
                            numero = Double.parseDouble(sb.toString());
                            sb.setLength(0);
                            postfijo.add(numero);
                            postfijo.add(pila.pop());
                            pila.push(ch);
                            pila.pop();
                        }
                        pila.pop();
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

    public static boolean checarSignos(String revisar) {
        boolean correcto = true;
        PilaA<Character> signos = new PilaA();
        int tamanho, i;
        Character signo;

        tamanho = revisar.length();
        i = 0;
        while (i < tamanho && correcto) {
            signo = revisar.charAt(i);
            if (signo == '+' || signo == '*' || signo == '/' || signo == '^' || signo == '-') {
                if (signos.isEmpty()) {
                    signos.push(signo);
                } else {
                    correcto = false;
                }
            } else {
                if (!signos.isEmpty()) {
                    signos.pop();
                }
            }
            i++;
        }
        if (!signos.isEmpty() && correcto) {
            correcto = false;
        }
        return correcto;
    }
    
    public static void main(String[] args) {
        Algoritmo algo = new Algoritmo();

        System.out.println(algo.convertidor("(1+2)*3"));
        System.out.println(algo.convertidor("(1+2)/3"));
        System.out.println(algo.convertidor("(1-2)*3"));
        System.out.println(algo.convertidor("3*(1+2)"));
        System.out.println(algo.convertidor("1+2*3"));
    }
}
