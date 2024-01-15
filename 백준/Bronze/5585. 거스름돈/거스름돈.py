price = int(input())
exchange = 1000 - price
y500 = exchange//500
y100 = (exchange%500)//100
y50 = ((exchange%500)%100)//50
y10 = (((exchange%500)%100)%50)//10
y5 = ((((exchange%500)%100)%50)%10)//5
y1 = ((((exchange%500)%100)%50)%10)%5
print(y500+y100+y50+y10+y5+y1)