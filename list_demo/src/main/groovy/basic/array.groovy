package basic

class array {
    public static void main(String[] args) {
        def birds = new String [3]
        birds.putAt(2, "Hoang Yen")
        birds[0] = "Hoa Mi"
        birds[1]= "Oanh"

        println "list birds in the graden : ${birds}"
        println birds
        println "list birds" + birds

        println birds.findAll{ it-> it == ~/Ye/}
        println birds.max{ it.length()}
        println birds.min { it.size()}
        println birds - "Oanh"
        println birds.find{ it=~ /Oa/}
        println birds.collect { it.reverse()}
    }
}
