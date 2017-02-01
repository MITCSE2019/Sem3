module q1 (w,e,f);
input [2:0]w;
input e;
output f;
wire [0:7]y;
dec3to8 stage0(e,w,y);
assign f=y[0]|y[2]|y[3]|y[4]|y[5]|y[7];
endmodule


module dec3to8 (e,w,y);
input e;
input [2:0]w;
output [0:7]y;
reg [0:7]y;
always @(w)
begin
if(e==0)
assign y=8'b00000000;
else
	case(w)
	0:y=8'b10000000;
	1:y=8'b01000000;
	2:y=8'b00100000;
	3:y=8'b00010000;
	4:y=8'b00001000;
	5:y=8'b00000100;
	6:y=8'b00000010;
	7:y=8'b00000001;
	endcase
end
endmodule
	

