module example6(x1,x2,x3,x4,f1); 
input x1,x2,x3,x4;
output f1;
assign f1=(x1&x3)|(x2&x3)|(x3&x4)|(x1&x2)|(x1&x4);
endmodule
