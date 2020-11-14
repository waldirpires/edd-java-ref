# http://www.graphviz.org/content/cluster

digraph G {

    node[shape=box]

	"{4 | 7 | 11 | 18 | 22 | 27 | 31}"
	
	18->7[label=esq]
	18->27[label=dir]
	
	7->4[label=esq]
	7->11[label=dir]
	
	27->22[label=esq]
	27->31[label=dir]
	
	
	31[color=orange, style=filled]
}

# http://www.graphviz.org/content/cluster

digraph G {

 14->12
//  14->15
//  12->30
//  15->23
//  15->40
 
 15[color=red]
 
// lista de adjacência    
//Nó: [14] -> [ 12  ]
//Nó: [12] -> [ 15 30  ]
//Nó: [15] -> [ 23 40  ]
//Nó: [23] -> [  ]
//Nó: [40] -> [  ]
//Nó: [30] -> [  ]
}

// célula
[NodoArvore|valor;filhos]  

// TAD
[TadArvore|raiz|exibir()]

[TadArvore]->[NodoArvore]

[NodoArvore]-filhos>[NodoArvore]

[Main]->[TadArvore]

![UML](http://yuml.me/af3b5479.jpg)


# http://www.graphviz.org/content/cluster

digraph G {

    17-> 5
    17->12
    5->3
    5->4
    
    12->10
    12->18
    17->20
    17->90
    17->23
    20->33
    90->2
    33->45

// 17 -> [ 5  12  20  90  23] 
//  5 ->
// 12 -> 
}

