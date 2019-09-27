#!/bin/bash
#
#mu.sh - Send a Message to a particular user
#############################################
#
# Save the username parameter
#
muser=$1

logged_on=$(who | grep -i -m 1 $muser | gawk '{print $1}')  #获取登录用户名

if [ -z $logged_on ]  #判断用户是否登录
then
  echo "$muser is not logged on."
  echo "Exiting script..."
  exit
fi

allowed=$(who -T | grep -i -m 1 $muser | gawk '{print $2}')

if [ $allowed != "+" ]
then
  echo "$muser does not allowing messaging."
  echo "Exiting script..."
  exit
fi

if [ -z $2 ]
then
  echo "No message parameter included."
  echo "Exiting script..."
  exit
fi

shift

while [ -n "$1" ]
do
  whole_message=$whole_message' '$1
  shift
done

uterminal=$(who | grep -i -m 1 $muser | gawk '{print $2}')

echo $whole_message | write $logged_on $uterminal

exit
