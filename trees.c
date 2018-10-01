#include<stdio.h>
#include<cs50.h>
struct Node{
    int data;
    struct Node*left;
    struct Node*right;
};
struct Node*head;
void insert(int value){
    struct Node*firstNode = (struct Node*)malloc(sizeof(struct Node));
    firstNode->data = value;
    firstNode->left = NULL;
    firstNode->right = NULL;
    if (head==NULL){
        head = firstNode;
    }
    else{
        struct Node*iterate = head;
        if(value<iterate->data){
            while(iterate->left!=NULL){
                iterate = iterate->left;
            }
            iterate->left = firstNode;
        }
        else{
            while(iterate->right!=NULL){
                iterate = iterate->right;
            }
            iterate->right = firstNode;
        }
    }
}
bool search(int value){
    struct Node*currentNode = head;
    if (head==NULL) return false;
    else if (value == currentNode->data) return true;
    else{
        if (value<currentNode->data){
            while(currentNode->left!=NULL){
                if (value==currentNode->data){
                    return true;
                }
                else{
                    currentNode = currentNode->left;
                }
            }
            return false;
        }
        else{
            while(currentNode->right!=NULL){
                if (value==currentNode->data){
                    return true;
                }
                else{
                currentNode = currentNode->right;
            }

        }
        return false;
    }
}
}
int main (){
    head = NULL;
    insert(1);
    insert(2);
    insert(3);
    insert(4);
    if (search(2)==true){
        printf("found");
    }
    else{
    printf("not found");
    }
}
