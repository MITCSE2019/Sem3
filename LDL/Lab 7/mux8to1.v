module mux8to1(w,s,f);
input [0:7]w;
input [2:0]s;
output f;
reg f;
always@(w)
case(s)
0:begin
f=w[0];
end
1:begin
f=w[1];
end
2:begin
f=w[2];
end
3:begin
f=w[3];
end
4:begin
f=w[4];
end
5:begin
f=w[5];
end
6:begin
f=w[6];
end
7:begin
f=w[7];
end
endcase
endmodule
