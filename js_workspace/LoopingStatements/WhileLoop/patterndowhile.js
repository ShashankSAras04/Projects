let pattern=""
let i=1
do
{
    
    let j=1
    do
    {
        pattern=pattern+" * "
        j++
    }while(j<=5)
    pattern=pattern+"\n"
    i++
}while(i<=3)
console.log(pattern)