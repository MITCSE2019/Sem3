module fulladd(ci,x,y,s,co);
input ci,x,y;
output s,co;
assign s=x^y^ci;
assign co=(x&y)|(x&ci)|(y&ci);
endmodule
