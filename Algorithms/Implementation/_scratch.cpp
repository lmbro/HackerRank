#include <cstdio>
#include <vector>

struct coord{
    int x, y;
};

int main(){
    std::vector<coord> points;
    std::vector< std::vector<int> > vector(3, std::vector<int>(3));
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            coord temp;
            temp.x=i;
            temp.y=j;
            points.push_back(temp);
            vector[i][j] = 0;
        }
    }
    for(int num=1; num<=9; num++){
        for(int iter=0; iter<=points.size(); iter++){
            for(int p=0; p<points.size(); p++){
                vector[points[p].x][points[p].y] = num;
            }
            
                    
                    


}

    