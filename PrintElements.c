#include<stdio.h>
#include<cs50.h>
struct Node {
    int data;
    struct Node*left;
    struct Node*right;
};
// insert the elements in the tree // 
struct Node* insert(struct Node *head,int data){
    struct Node*firstNode = (struct Node*)malloc(sizeof(struct Node));
    firstNode->data = data;
    firstNode->left = NULL;
    firstNode->right = NULL;
    if (head==NULL){
        head=firstNode;
        return head;
    }
    else{
        if (data<head->data){
            if (head->left==NULL){
                head->left = firstNode;
                return head;
            }
            head->left = insert(head->left,data);
        }
        else{
                if (head->right==NULL){
                head->right= firstNode;
                return head;
            }

            head->right = insert(head->right,data) ;
        }
     }
     return head;
} // print the elements in Preorder i.e first root then left then right
void PrintPreorder(struct Node*head){
    if (head==NULL) return ;
    printf("%i",head->data); 
    PrintPreorder(head->left);
    PrintPreorder(head->right);
} // print the elements in Preorder i.e first left then root then right
void PrintInorder(struct Node*head){
    if (head==NULL) return ;
    PrintInorder(head->left);
    printf("%i",head->data);
    PrintInorder(head->right);
}
// print the elements in Preorder i.e first left then right then root
void PrintPostorder(struct Node*head){
    if (head==NULL) return ;
    PrintPostorder(head->left);
    PrintPostorder(head->right);printf("%i",head->data);
}
int main (){
    struct Node*head=NULL;
    head = insert(head,4);
    head = insert(head,3);
    head = insert(head,2);
    head = insert(head,1);
    PrintPreorder(head);
    printf("\n");
    PrintInorder(head);
    printf("\n");
    PrintPostorder(head);


}
