# Estrutura Condicional Switch
É uma funcionalidade que deixa o código mais organizado.

O switch só funciona com char, int, byte, short , enum , String.

**Exemplo: Imprima o dia da semana, considerando 1 como domingo.**
```java
byte dia = 5;
if(dia == 1){
    System.out.println("Domingo");
}else if(dia == 2){
    System.***out***.println("Segunda");`
}
```
**Função Switch:**

```java
byte day = 5;
switch (day) {   
 case 1:        
  System.out.println("Domingo");       
  break;   
 case 2:      
   System.out.println("Segunda");      
   break;    
 case 3:      
   System.out.println("Terça");       
   break;   
 case 4:      
   System.out.println("Quarta");     
   break;   
 case 5:      
   System.out.println("Quinta");        
   break;   
 case 6:      
   System.out.println("Sexta");      
   break;    
 case 7:     
    System.out.println("Sábado");        
    break;   
 default:     
    System.out.println("Opção inválida");      
    break;
   }
```

### **`default`**
É a opção padrão, utilizada quando o usuário digita um valor que não corresponde a nenhum dos casos do switch.

- Pode ser colocado em qualquer lugar dentro do bloco switch (a posição não importa).

### **`break`**
É utilizado para interromper a execução do switch, evitando que os casos seguintes sejam imprimidos.

**Exemplo:**

Se **`byte = 5`** e o código não tiver **`break`**, a saída será:

**`Quinta, Sexta, Sábado`**
