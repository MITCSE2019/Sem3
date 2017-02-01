module dec3to8 (e,w,y);
input e;
input [2:0]w;
output [0:7]y;
reg [0:7]y;
always @(w)
begin
if(e==0)
assign y=8'b11111111;
else
	case(w)
	0:y=8'b01111111;
	1:y=8'b10111111;
	2:y=8'b11011111;
	3:y=8'b11101111;
	4:y=8'b11110111;
	5:y=8'b11111011;
	6:y=8'b11111101;
	7:y=8'b11111110;
	endcase
end
endmodule
	
