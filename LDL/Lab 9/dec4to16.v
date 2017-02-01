module dec4to16 (e,w,y);
input e;
input [3:0]w;
output [15:0]y;
dec3to8_4 stage0(~w[3]&e,w[2:0],y[7:0]);
dec3to8_4 stage1(w[3]&e,w[2:0],y[15:8]);
endmodule

module dec3to8_4 (a,b,c);
input a;
input [2:0]b;
output [7:0]c;
reg [7:0]c;
always @(b)
begin
if(a==0)
assign c=0;
else
	case(b)
	0:c=8'b00000001;
	1:c=8'b00000010;
	2:c=8'b00000100;
	3:c=8'b00001000;
	4:c=8'b00010000;
	5:c=8'b00100000;
	6:c=8'b01000000;
	7:c=8'b10000000;
	endcase
end
endmodule
