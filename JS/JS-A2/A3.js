<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AdvanceQ3</title>
</head>
<body>
    <script>
       // this is simple fun function;
        function  fun()
       {
        return "I am a fun Function";
       }

       //This is an Anonymous function with imediate call;
       

        (function(){

        console.log("I am in anonymous function and return the exaclty what is in parameter => \n"+'"('+fun+')"');

        }

        )(fun);//last (fun) shows imediate call to the anonymous function and "fun" is parameter to it;

    </script>
</body>
</html>