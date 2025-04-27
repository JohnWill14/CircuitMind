package br.com.william.chapters.c002


fun mergeSort(vetor: Array<Int>, begin: Int, middle:Int, end: Int ): Unit {
    val n1 = middle - begin + 1
    val n2 = end - middle
    val vetor1 = IntArray(n1)
    val vetor2 = IntArray(n2)

    for (i in 0..(n1 - 1) ) {
        vetor1[i] = vetor[begin + i]
    }
    for (i in 0..(n2 - 1) ) {
        vetor2[i] = vetor[middle + 1 + i]
    }

    var i = 0
    var j = 0

    for (k in begin..end) {
        if (vetor1.size <= i) {
            vetor[k] = vetor2[j]
            j++
        } else if (vetor2.size <= j) {
            vetor[k] = vetor1[i]
            i++
        } else if (vetor1[i] <= vetor2[j]) {
            vetor[k] = vetor1[i]
            i++
        } else {
            vetor[k] = vetor2[j]
            j++
        }
    }

}

fun merge(vetor: Array<Int>, begin: Int, end: Int): Unit {
    if (begin < end) {
        val middle = (begin + end) / 2
        merge(vetor, begin, middle)
        merge(vetor, middle + 1, end)
        mergeSort(vetor, begin, middle, end)
    }
}

fun main() {
    val vetor = arrayOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
    merge(vetor, 0, vetor.size - 1)
    for (i in vetor) {
        print("$i ")
    }
}