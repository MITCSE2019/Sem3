module muxbcd2gr(b,g);
input [3:0]b;
output [3:0]g;
wire [0:7]m,q,w,e;
integer k;
assign q=8'b00001111;
mux8to1 stage0(q,b[3:1],g[3]);
assign w=8'b00111100;
mux8to1 stage1(w,b[3:1],g[2]);
assign e=8'b01100110;
mux8to1 stage2(e,b[3:1],g[1]);
assign m[0]=b[0];
assign m[1]=~b[0];
assign m[2]=b[0];
assign m[3]=~b[0];
assign m[4]=b[0];
assign m[5]=~b[0];
assign m[6]=b[0];
assign m[7]=~b[0];
mux8to1 stage3(m,b[3:1],g[0]);
endmodule

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

