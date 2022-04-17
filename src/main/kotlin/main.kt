fun main(){
    val likes = 1001
    val people = "Людям"
    val human = "Человеку"
    if (likes % 10 == 1){
        println("Понравилось $likes $human")
    }
    else {
        println("Понравилось $likes $people")
    }
}