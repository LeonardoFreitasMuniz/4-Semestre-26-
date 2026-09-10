## Engenharia de Software

### [Simulado da Avaliação A2.1](https://github.com/LeonardoFreitasMuniz/4-Semestre-26-/blob/main/EngenhariaDeSoftware-2/SimuladoA2.1/SIMULADO%20AVALIA%C3%87%C3%83O%20A2.1%20ENG%20DE%20SOF.1.pdf)

## Estruturas De Dados || (Quinta)

**RDD = Rotação dupla pra Direita**

### Primeira rotação para a esquerda é com B e para a direita é com A

```java
private NoAVL rotacaoDD(NoAVL A) {
    NoAVL B = A.getEsq();
    rotacaoSE(B); // Primeiro rotaciona para a esquerda 
    return (rotacaoSD(A)); // E depois para a direita, sendo uma rotação dupla para a direita
}
```

**RDE = Rotação dupla pra Esquerda**

### Primeira rotação para a direita é com B e para a esquerda é com A

```java
private NoAVL rotacaoDE(NoAVL A) {
    NoAVL B = A.getDir();
    rotacaoSD(B); // Primeiro rotaciona para a direita
    return (rotacaoSE(A)); // Depois rotaciona para a esquerda
}
```
