1. public String coinFlip(){
    int num = (int) Math.random() *3;
    if (num < 2){
        return "heads"
    } else {
        return "tails"
    }
}

2. public boolean arePermutations(int[] array1, int[] array2){
    if(array1.length == array2.length) return false;
    for (int i = 0; i < array1.length; i++){
        if (array2.indexOf(array1[i]) == -1) return false;
    }
    return true;
}


3. {3, 2, 1, 4}