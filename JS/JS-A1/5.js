<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Q5</title>
</head>
<body>
    <script>
         const a = parseInt(prompt('Enter a Year: '));

        function leapprint(a){
            for(i=1;i<=20;i++){
                a=a+4;
                document.write(" "+a);
            }
            
        }
        leapprint(a);
        
    </script>
</body>
</html>