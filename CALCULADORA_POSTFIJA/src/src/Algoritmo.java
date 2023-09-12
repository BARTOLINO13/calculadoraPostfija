/**
 *BARTOLINO
 *7 Sept 2023
 */
package src;

import static java.lang.Math.pow;
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

        signo = revisar.charAt(0);
        if(signo == '+' || signo == '*' || signo == '/' || signo == '^' || signo == '-')
            correcto=false;
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
    public double evalua(ArrayList postfijo) {
        double ans;
        double v;
        double x, y;
        PilaA<Double> pila = new PilaA();
        Character p;
        for (int i = 0; i < postfijo.size(); i++) {
            System.out.println(postfijo.get(i));

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
                        v = pow(x, y);
                        pila.push(v);
                        break;
                }
            }

        }

        ans = (double) pila.pop();
        return ans;
    }

    public static void main(String[] args) {
        Algoritmo algo = new Algoritmo();

        ArrayList lista = algo.convertidor("(1+2)*2");
        System.out.println(algo.evalua(lista));
//        System.out.println(algo.convertidor("(1+2)*3"));
//        System.out.println(algo.convertidor("(1+2)/3"));
//        System.out.println(algo.convertidor("(1-2)*3"));
//        System.out.println(algo.convertidor("3*(1+2)"));
//        System.out.println(algo.convertidor("1+2*3"));
//        System.out.println(algo.checarSignos("1+*2"));
    }
}
