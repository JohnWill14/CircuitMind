package br.com.william.chapters.c003

fun kadane(array: IntArray): Int {
  if (array.isEmpty()) {
        return 0
  }

  var sum = 0
  var ans = Int.MIN_VALUE
  val size = array.size - 1

  for(i in 0..size){
      if (sum < 0) {
          sum = 0
      }

      sum += array[i]
      ans = maxOf(ans, sum)
  }

  return ans
}

fun main() {
    println(kadane(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    println(kadane(intArrayOf(-2, -1, -3, -4, -1, -2, -1, -5, -4)))
}
