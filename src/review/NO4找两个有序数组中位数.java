package review;

public class NO4找两个有序数组中位数 {
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
//        int p = 0, q = 0;//指向两个数组的指针
//        //之前写的太恶心了 重构一下 就是按顺序 从小到大找  如果数组空了直接从另一个数组找
//        //从小到大 需要指针  需要数组非空
//        //分成奇数偶数两种情况 
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
		//妈的 上面写的 都好恶心啊
		
//        if(n % 2 != 0){//一共奇数个
//        	int ct = n / 2 + 1;
//        	for(int i = 1; i <= ct; i++){//第一个 到第ct个
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
//        }else{//偶数个
//        	int ct = n / 2 + 1;
//        	int c = n / 2;
//        	int count = 0;
//        	for(int i = 1; i <= ct; i++){//第一个 到第c个 和第 ct个
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
