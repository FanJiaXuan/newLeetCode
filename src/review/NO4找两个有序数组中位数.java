package review;

public class NO4����������������λ�� {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int []a = new int[nums1.length + nums2.length];
		int i = 0, j = 0;
		int k = 0;
		while(i < nums1.length && j < nums2.length){
			if(nums1[i] < nums2[j])
				a[k++] = nums1[i++];
			else
				a[k++] = nums2[j++];
		}
		while(i != nums1.length){
			a[k++] = nums1[i++];
		}
		while(j != nums2.length){
			a[k++] = nums2[j++];
		}
		if((nums1.length + nums2.length) % 2 != 0){
			return a[(nums1.length + nums2.length) / 2];
		}else{
			return (a[(nums1.length + nums2.length) / 2] + a[(nums1.length + nums2.length) / 2 - 1]) / 2.0;
		}
		
//        int n1 = nums1.length;
//        int n2 = nums2.length;
//        int n = n1 + n2;
//        //System.out.println(n);
//        int p = 0, q = 0;//ָ�����������ָ��
//        //֮ǰд��̫������ �ع�һ�� ���ǰ�˳�� ��С������  ����������ֱ�Ӵ���һ��������
//        //��С���� ��Ҫָ��  ��Ҫ����ǿ�
//        //�ֳ�����ż��������� 
//        
//        if(n % 2 != 0){
//        	int tar = n / 2 + 1;
//        	int co = 0;
//        	while(nums1 != null || nums2 != null){
//            	co++;
//            	if(co == tar){
//            		if(nums1[p] < nums2[q])
//            			return nums1[p];
//            		else
//            			return nums2[q];
//            	}else{
//            		if(nums1[p] < nums2[q])
//            			p++;
//            		else
//            			q++;
//            	}
//            }
//        }
		//��� ����д�� ���ö��İ�
		
//        if(n % 2 != 0){//һ��������
//        	int ct = n / 2 + 1;
//        	for(int i = 1; i <= ct; i++){//��һ�� ����ct��
//        		if(i != ct){
//        			if(nums1[p] < nums2[q]){
//        				p++;
//        			}else{
//        				q++;
//        			}
//        		}
//        		else{
//        			if(nums1[p] < nums2[q]){
//        				return nums1[p];
//        			}else{
//        				return nums2[q];
//        			}
//        		}
//        	}
//        }else{//ż����
//        	int ct = n / 2 + 1;
//        	int c = n / 2;
//        	int count = 0;
//        	for(int i = 1; i <= ct; i++){//��һ�� ����c�� �͵� ct��
//        		if(i == c){
//        			if(nums1[p] < nums2[q]){
//        				count += nums1[p++];
//        			}else{
//        				count += nums2[q++];
//        			}
//        			
//
//        			
//        		}
//        		else if(i == ct){
//        			System.out.println("i:" + i );
//        			if(nums1[p] < nums2[q]){
//        				//System.out.println(nums);
//        				//System.out.println();
//        				return (nums1[p] + count) / 2;
//        			}else{
//        				return (nums2[q] + count) / 2;
//        			}
//        		}else{
//        			if(nums1[p] < nums2[q]){
//        				p++;
//        				//System.out.println("p:" + p);
//        			}else{
//        				q++;
//        				//System.out.println("q:" + q);
//        			}
//        		}
//        	}
//        }
//        return 0;
    }
}
