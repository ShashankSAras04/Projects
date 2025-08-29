let num = -100;

if ((num >= 0 && num <= 9) || (num < 0 && num >= -9)) {
    console.log(num + " has one digit");
} 
else if ((num >= 10 && num <= 99) || (num < 0 && num <= -10 && num >= -99)) {
    console.log(num + " has two digits");
} 
else if ((num >= 100 && num <= 999) || (num < 0 && num <= -100 && num >= -999)) {
    console.log(num + " has three digits");
} 
else if ((num >= 1000 && num <= 9999) || (num < 0 && num <= -1000 && num >= -9999)) {
    console.log(num + " has four digits");
} 
else {
    console.log(num + " has five or more digits");
}
