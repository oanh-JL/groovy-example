package basic

class app {
    public static void main(String[] args) {
        def list = ["oanh", "kien", "an", "ngoc"].withDefault {"oanh"}
        print(list)
        def list2 = ["element1","element2", "element3"]
        list2.push("element4")
        list2 << "element5"

println list2
list2.plus(5,"element6")
println(list2)
println list2.findAll{ it = ~/ele/}
println list.collate(2)

println list2.collate(2, false)
println list2.count { it = ~/ele/}

println list*.toUpperCase()

println list*.findAll{ it = ~/oan/}

}
}