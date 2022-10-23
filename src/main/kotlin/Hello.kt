fun main(){
    print(reverseWords("hello world"))
}

fun reverseWords(str: String): String{
    var start = 0
    var end = str.length -1
    var returnStr = str
    while(start < end){
        returnStr = swap(returnStr, start, end)
        start++
        end--
    }
    return returnStr
}

fun swap(str: String, start: Int, end: Int) =
    buildString{
        this.append(str)
        setCharAt(start, str[end])
        setCharAt(end, str[start])
    }