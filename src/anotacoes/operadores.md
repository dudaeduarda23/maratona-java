# Operadores
***
# Operadores Aritméticos
Permite realizar matemática com números.
## Operador +
Pode ser utilizado como soma e concatenação:

Se vier uma **string** antes da operação vira concatenação.

```java
int number2 = 20;
int number1 = 10;
System.out.println("valor"+numero2+numero1);
```
Saída → valor 2010

Mas uma **string** depois de uma operação vira soma.

```java
int number2 = 20;
int number1 = 10;
System.out.println(numero2+numero1+"valor");
Saída -> 30 valor
```
## Operador /

**Critério:** divisão entre inteiros resulta em resultado inteiro.

```java
int number1 = 10;
int number2 = 20;
double result = number1 / number2;
```
Mesmo que a variável seja double o resultado é inteiro.
***
# Operadores de Atribuição
Foram feitos para economizar linha/espaço no código.

+=  -=   *=  %=

```java
double bonus = 1800;
bonus = bonus + 1000;
System.out.println(bonus);
```

### Com atribuição

```java
double bonus1 = 1800;
bonus1 += 1000;
System.out.println(bonus1);
```

## Atribuição unitária (++) ou ( - - )

Só funciona de 1 em 1.
```java
int contador = 0;
contador = contador + 1;
contador++; // 1 + 1
System.out.println(contador);
```