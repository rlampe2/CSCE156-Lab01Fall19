<?php

  //TODO: modify these to pull posted parameter values
  $name  = $_POST[name];
  $month = $_POST[month];
  $date  = $_POST[date];
  $year  = $_POST[year];

  $today = new DateTime();
  $bday  = new DateTime();
  $bday->setTime(0, 0, 0);
  $bday->setDate($year, $month, $date);

  $difference = $today->diff($bday);
  $difference_p = $today->diff($bday_p);

  $years = $difference->y;
  $months = $difference->m;
  $days  = $difference->d;

  $bday_p = new DateTime();
  $bday_p->setTime(0, 0, 0);
  $bday_p->setDate($year + $years + 1, $month, $date);
  $difference_p = $today->diff($bday_p);

  $days_until_next_bd = $difference_p->days + 1;
?>

<html>
  <head>
    <title>Birthday Greeting</title>
  </head>

  <body>
    <h1>Birthday Greeting</h1>
    <p>Greetings, <?php print $name; ?>.  Today you are <?php print $years ?> years, <?php print $months ?> months, and <?php print $days ?> days old.  
    <?php
      //TODO: modify this to print "Happy Birthday" or "Your friends have..." depending on the appropriate conditionals
    if($days_until_next_bd == 0){
        print "Happy Birthday!";
    }else{
            print "Your friends have " + $days_until_next_bd + " to shop for you!";
        }
     ?>
    </p> 
  </body>
</html>